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
                if (column.getNullRatio() != null && column.getNullRatio().isInfinite()) LOGGER.severe("NullRatio is infinite");
                if (column.getUniqueRatio() != null && column.getUniqueRatio().isInfinite()) LOGGER.severe("UniqueRatio is infinite");
                if (column.getWidthAvg() != null && column.getWidthAvg().isInfinite()) LOGGER.severe("WidthAvg is infinite");

                if (column.getNullRatio() != null && column.getNullRatio().isNaN()) LOGGER.severe("NullRatio is NaN");
                if (column.getUniqueRatio() != null && column.getUniqueRatio().isNaN()) LOGGER.severe("UniqueRatio is NaN");
                if (column.getWidthAvg() != null && column.getWidthAvg().isNaN()) LOGGER.severe("WidthAvg is NaN");

                if (column.getNullRatio() != null && column.getNullRatio() < 0) LOGGER.severe("NullRatio is negative");
                if (column.getUniqueRatio() != null && column.getUniqueRatio() < 0) LOGGER.severe("UniqueRatio is negative");
                if (column.getWidthAvg() != null && column.getWidthAvg() < 0) LOGGER.severe("WidthAvg is negative");

                // Integers
                if (column.getRowCount() != null && column.getRowCount() < 0) LOGGER.severe("RowCount is negative");
            }
        }
	}
}
