module com.microsoft.sqlserver.jdbc {
	exports com.microsoft.sqlserver.jdbc;
	exports microsoft.sql;

	requires java.sql;
	requires java.naming;
	requires java.security.jgss;

	requires static azure.client.runtime;
	requires static azure.keyvault;
	requires static azure.keyvault.webkey;

	provides java.sql.Driver with com.microsoft.sqlserver.jdbc.SQLServerDriver;
}