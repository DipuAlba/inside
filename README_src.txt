*************************************************************************************************
* inside-src.zip
* Inside se distribuye bajo la la licencia EUPL1.1.
*************************************************************************************************
Los componentes incluidos en inside-src.zip se enumeran a continuación:

	- fuentes: Contiene el código fuente de la aplicación Inside, compuesta por los módulos
		- inside-mvn-base
		- eeutil-client
		- inside-cliente-firma
		- infofirma-service		
		- inside-model
		- inside-services
		- load-tables
		- inside-util-web
		- csvstorage-client
		- inside-web

	- lib: Librer�as que usa la aplicaci�n Inside
	- resources
		
		- config
			- schemas: Esquemas XSD del Expediente y Documento ENI
			- afirma-server-triphase-signer.properties
			- afirma.properties
			- almacen.jks
			- clientWSRegistroElectronico.properties												
			- csvstorage.properties
			- database.properties
			- firma.properties
			- infofirma.properties
			- loadTables-config.properties
			- log4j.properties
			- mailToken.properties
			- messages.properties
			- clave.properties
			- SignModule_SP.xml
			- StorkSamlEngine_SP.xml			
			- SamlEngine.xml												
			- siaService.properties
			- temporalData.properties
			- trustStore.jks
			- utilFirma.properties
			- visualizacion.properties
			- ws-security.jks
			- ws-security.properties
			

		- scripts_bbdd: Scripts de BBDD
			- 1_creacion_objetos_mysql.sql
			- 2_inserts_GeneradorClave_mysql.sql
			- 4_quartz.sql

			- 1 - insert_aplicacion.sql
			- 2_inserts_usuarios.sql
			
		
		- endorsed_lib: Librer�as a copiar en el directorio endorsed de la JRE
	
	- Web Services externos:

		- firma-remota: Especificaci�n de WS de firma remota (WSDL).
		- infofirma: Especificaci�n de WS de obtenci�n de informaci�n de firmas (WSDL).
		- visualizacion: Especificaci�n de WS de visualizaci�n de documentos ENI e �ndice de expedientes ENI (WSDL).
		- csvstorage: Especificaci�n de WS de almacenamiento de documentos (WSDL).
		- clientewsregistroelectronico: Especificaci�n de WS de registro electr�nico (WSDL).
		- afirma: Especificaci�n de WS de validar firma (WSDL).
		- loadTables: Especificaci�n de WS de carga de tablas (WSDL).
		- siaService: Especificaci�n de WS de carga c�digo Sia (WSDL).
		 
		
	- licenses: Contiene las licencias bajo las que se distribuyen las librer�as de las que depende Inside.

	- LICENSE_EUPL_1.1.pdf: Licencia EUPL1.1, bajo la que se distribuye Inside.
	



