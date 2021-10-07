set projectLocation=C:\Users\satee\eclipse-workspace\PDFMaven

cd %projectLocation%

set classpath=%projectLocation%\target\classes;%projectLocation%\libs\*;

java org.testng.TestNG %projectLocation%\testng.xml


pause
