package export;

import main.Column;
import main.Relationship;
import main.Table;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

// Export into .graphml, which can be opened with yEd.
// A good layout in yEd is "BPMN".
// The class is based around Relationship and not around CompoundRelationship to be able to display false negatives
// (CompoundRelationship filters out rejected FK constrains -> we would not be able to print them out).
public class GraphML {

	final static private String HEADER = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
			"<graphml xmlns=\"http://graphml.graphdrawing.org/xmlns\" xmlns:java=\"http://www.yworks.com/xml/yfiles-common/1.0/java\" xmlns:sys=\"http://www.yworks.com/xml/yfiles-common/markup/primitives/2.0\" xmlns:x=\"http://www.yworks.com/xml/yfiles-common/markup/2.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:y=\"http://www.yworks.com/xml/graphml\" xmlns:yed=\"http://www.yworks.com/xml/yed/3\" xsi:schemaLocation=\"http://graphml.graphdrawing.org/xmlns http://www.yworks.com/xml/schema/graphml/1.1/ygraphml.xsd\">\n" +
			"  <key for=\"port\" id=\"d0\" yfiles.type=\"portgraphics\"/>\n" +
			"  <key for=\"port\" id=\"d1\" yfiles.type=\"portgeometry\"/>\n" +
			"  <key for=\"port\" id=\"d2\" yfiles.type=\"portuserdata\"/>\n" +
			"  <key attr.name=\"url\" attr.type=\"string\" for=\"node\" id=\"d3\"/>\n" +
			"  <key attr.name=\"description\" attr.type=\"string\" for=\"node\" id=\"d4\"/>\n" +
			"  <key for=\"node\" id=\"d5\" yfiles.type=\"nodegraphics\"/>\n" +
			"  <key for=\"graphml\" id=\"d6\" yfiles.type=\"resources\"/>\n" +
			"  <key attr.name=\"url\" attr.type=\"string\" for=\"edge\" id=\"d7\"/>\n" +
			"  <key attr.name=\"description\" attr.type=\"string\" for=\"edge\" id=\"d8\"/>\n" +
			"  <key for=\"edge\" id=\"d9\" yfiles.type=\"edgegraphics\"/>\n" +
			"  <graph edgedefault=\"directed\" id=\"G\">";

	// Has variables: {$id, $name, $height, $text, $x}
	final static private String NODE = "    <node id=\"$id\">\n" +
			"      <data key=\"d5\">\n" +
			"        <y:GenericNode configuration=\"com.yworks.entityRelationship.big_entity\">\n" +
			"          <y:Geometry height=\"$height\" width=\"150.0\" x=\"$x\" y=\"20.0\"/>\n" +
			"          <y:Fill color=\"#E8EEF7\" color2=\"#B7C9E3\" transparent=\"false\"/>\n" +
			"          <y:BorderStyle color=\"#000000\" type=\"line\" width=\"1.0\"/>\n" +
			"          <y:NodeLabel alignment=\"center\" autoSizePolicy=\"content\" backgroundColor=\"#B7C9E3\" configuration=\"com.yworks.entityRelationship.label.name\" fontFamily=\"Dialog\" fontSize=\"12\" fontStyle=\"plain\" hasLineColor=\"false\" height=\"18.1328125\" modelName=\"internal\" modelPosition=\"t\" textColor=\"#000000\" visible=\"true\" width=\"36.666015625\" x=\"21.6669921875\" y=\"4.0\">$name</y:NodeLabel>\n" +
			"          <y:NodeLabel alignment=\"left\" autoSizePolicy=\"content\" configuration=\"com.yworks.entityRelationship.label.attributes\" fontFamily=\"Dialog\" fontSize=\"12\" fontStyle=\"plain\" hasBackgroundColor=\"false\" hasLineColor=\"false\" height=\"46.3984375\" modelName=\"custom\" textColor=\"#000000\" visible=\"true\" width=\"65.541015625\" x=\"2.0\" y=\"30.1328125\"><![CDATA[$text]]><y:LabelModel>\n" +
			"              <y:ErdAttributesNodeLabelModel/>\n" +
			"            </y:LabelModel>\n" +
			"            <y:ModelParameter>\n" +
			"              <y:ErdAttributesNodeLabelModelParameter/>\n" +
			"            </y:ModelParameter>\n" +
			"          </y:NodeLabel>\n" +
			"          <y:StyleProperties>\n" +
			"            <y:Property class=\"java.lang.Boolean\" name=\"y.view.ShadowNodePainter.SHADOW_PAINTING\" value=\"true\"/>\n" +
			"          </y:StyleProperties>\n" +
			"        </y:GenericNode>\n" +
			"      </data>\n" +
			"    </node>";

	// Has variables: {$id, $source, $target, $text, $color}
	final static private String EDGE = "    <edge id=\"$id\" source=\"$source\" target=\"$target\">\n" +
			"      <data key=\"d8\"><![CDATA[$text]]></data>" +
			"      <data key=\"d9\">\n" +
			"        <y:PolyLineEdge>\n" +
			"          <y:Path sx=\"0.0\" sy=\"0.0\" tx=\"0.0\" ty=\"0.0\"/>\n" +
			"          <y:LineStyle color=\"$color\" type=\"line\" width=\"1.0\"/>\n" +
			"          <y:Arrows source=\"none\" target=\"standard\"/>\n" +
			"          <y:EdgeLabel alignment=\"center\" configuration=\"AutoFlippingLabel\" distance=\"2.0\" fontFamily=\"Dialog\" fontSize=\"12\" fontStyle=\"plain\" hasBackgroundColor=\"false\" hasLineColor=\"false\" hasText=\"false\" height=\"4.0\" modelName=\"custom\" preferredPlacement=\"anywhere\" ratio=\"0.5\" textColor=\"#000000\" visible=\"true\" width=\"4.0\" x=\"55.7049560546875\" y=\"28.0\">\n" +
			"            <y:LabelModel>\n" +
			"              <y:SmartEdgeLabelModel autoRotationEnabled=\"false\" defaultAngle=\"0.0\" defaultDistance=\"10.0\"/>\n" +
			"            </y:LabelModel>\n" +
			"            <y:ModelParameter>\n" +
			"              <y:SmartEdgeLabelModelParameter angle=\"0.0\" distance=\"30.0\" distanceToCenter=\"true\" position=\"right\" ratio=\"0.5\" segment=\"0\"/>\n" +
			"            </y:ModelParameter>\n" +
			"            <y:PreferredPlacementDescriptor angle=\"0.0\" angleOffsetOnRightSide=\"0\" angleReference=\"absolute\" angleRotationOnRightSide=\"co\" distance=\"-1.0\" frozen=\"true\" placement=\"anywhere\" side=\"anywhere\" sideReference=\"relative_to_edge_flow\"/>\n" +
			"          </y:EdgeLabel>\n" +
			"          <y:BendStyle smoothed=\"false\"/>\n" +
			"        </y:PolyLineEdge>\n" +
			"      </data>\n" +
			"    </edge>";

	final static private String FOOTER = "  </graph>\n" +
			"  <data key=\"d6\">\n" +
			"    <y:Resources/>\n" +
			"  </data>\n" +
			"</graphml>";

	public static void writeGraph(File file, List<Table> tables, List<Relationship> relationships) throws FileNotFoundException, UnsupportedEncodingException {

		// Rewrite the old file
		try (PrintWriter writer = new PrintWriter(file, "UTF-8")) {
			writer.println(HEADER);

			// Print nodes
			int position = 1;
			for (Table table : tables) {
				writer.println(getNode(table, position));
				position++;
			}

			// Print edges
			int id = 1;
			for (Relationship relationship : relationships) {
				if (relationship.isEstimatedFk() || relationship.isForeignKey()) {
					writer.println(getEdge(relationship, id));
					id++;
				}
			}

			writer.println(FOOTER);
		}
	}

	public static void writeGraph(List<Table> tables, List<Relationship> relationships) throws FileNotFoundException, UnsupportedEncodingException {
		File file = new File("graph.graphml");
		writeGraph(file, tables, relationships);
	}

	private static String getNode(Table table, int xPosition) {
		String result = NODE;
		result = result.replace("$id", table.getName());
		result = result.replace("$name", table.getName());
		String text = "<html><body>";
		for (Column column : table.getColumnList()) {
			String col = column.getName();
			if (column.isPrimaryKey() && column.isEstimatedPk())
				col = "<b>" + column.getName() + "</b>";
			else if (column.isPrimaryKey() && !column.isEstimatedPk())
				col = "<b><font color=\"#00FF00\">" + column.getName() + "</font></b>" ; // To add
			else if (!column.isPrimaryKey() && column.isEstimatedPk())
				col = "<b><font color=\"#FF0000\">" + column.getName() + "</font></b>"; // To remove
			text = text + col + "<br/>";
		}
		text += "</body></html>";
		result = result.replace("$text", text);
		result = result.replace("$height", Integer.toString(36+15*table.getColumnList().size()));
		result = result.replace("$x", Integer.toString(170*xPosition));
		return result;
	}

	private static String getEdge(Relationship relationship, int id) {
		String result = EDGE;
		result = result.replace("$id", "e"+id);
		result = result.replace("$source", relationship.getFkTable());
		result = result.replace("$target", relationship.getPkTable());
		result = result.replace("$text", relationship.toString());
		if (relationship.isEstimatedFk() && relationship.isForeignKey()) {
			result = result.replace("$color", "#000000");
		} else if (relationship.isEstimatedFk() && !relationship.isForeignKey()) {
			result = result.replace("$color", "#FF0000"); // Edge to remove
		} else if (!relationship.isEstimatedFk() && relationship.isForeignKey()) {
			result = result.replace("$color", "#00FF00"); // Edge to add
		}
		return result;
	}

}
