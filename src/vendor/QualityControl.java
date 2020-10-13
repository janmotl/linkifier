package vendor;

import main.Column;
import main.Table;

import java.util.List;
import java.util.logging.Logger;

public class QualityControl {
    private final static Logger LOGGER = Logger.getLogger(QualityControl.class.getName());

    // Nulls are ok. Infinity, NaNs and negative values are suspicious.
    public static void qcNumericalValues(List<Table> tables) {
        for (Table table : tables) {
            for (Column column : table.getColumnList()) {
                // Doubles
                if (column.getNullRatio() != null && column.getNullRatio().isInfinite()) LOGGER.severe("NullRatio in " + table.getName() + "." + column.getName() + " is infinite");
                if (column.getUniqueRatio() != null && column.getUniqueRatio().isInfinite()) LOGGER.severe("UniqueRatio " + table.getName() + "." + column.getName() + " is infinite");
                if (column.getWidthAvg() != null && column.getWidthAvg().isInfinite()) LOGGER.severe("WidthAvg " + table.getName() + "." + column.getName() + " is infinite");

                if (column.getNullRatio() != null && column.getNullRatio().isNaN()) LOGGER.severe("NullRatio " + table.getName() + "." + column.getName() + " is NaN");
                if (column.getUniqueRatio() != null && column.getUniqueRatio().isNaN()) LOGGER.severe("UniqueRatio " + table.getName() + "." + column.getName() + " is NaN");
                if (column.getWidthAvg() != null && column.getWidthAvg().isNaN()) LOGGER.severe("WidthAvg " + table.getName() + "." + column.getName() + " is NaN");

                if (column.getNullRatio() != null && column.getNullRatio() < 0) LOGGER.severe("NullRatio " + table.getName() + "." + column.getName() + " is negative");
                if (column.getUniqueRatio() != null && column.getUniqueRatio() < 0) LOGGER.severe("UniqueRatio " + table.getName() + "." + column.getName() + " is negative");
                if (column.getWidthAvg() != null && column.getWidthAvg() < 0) LOGGER.severe("WidthAvg " + table.getName() + "." + column.getName() + " is negative");

                if (column.getNullRatio() != null && column.getNullRatio() > 1) LOGGER.severe("NullRatio " + table.getName() + "." + column.getName() + " is bigger than 1");
                if (column.getUniqueRatio() != null && column.getUniqueRatio() > 1) LOGGER.severe("UniqueRatio " + table.getName() + "." + column.getName() + " is bigger than 1");

                // Integers
                if (column.getRowCount() != null && column.getRowCount() < 0) LOGGER.severe("RowCount " + table.getName() + "." + column.getName() + " is negative");
            }
        }
	}
}
