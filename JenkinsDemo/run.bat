cd %WORKSPACE%\JenkinsDemo
java -cp bin;lib/* org.testng.TestNG testng.xml
echo "Hello from poll SCM"
