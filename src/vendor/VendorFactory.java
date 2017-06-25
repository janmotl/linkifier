package vendor;

public class VendorFactory {

	public static Vendor getVendor(String vendor) {
		switch (vendor) {
			case "MySQL":
				return new MySQL();
			case "PostgreSQL":
				return new PostgreSQL();
			case "Oracle":
				return new Oracle();
			case "Microsoft SQL Server":
				return new MSSQL();
			default:
				return new Default();
		}
	}
}
