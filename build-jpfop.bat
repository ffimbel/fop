@echo off

echo Fop Build System
echo ----------------

if "%JAVA_HOME%" == "" goto error

set XERCES=lib\xerces.jar
set XALAN=lib\xalan.jar
set BSF=lib\bsf.jar

set LOCALCLASSPATH=%JAVA_HOME%\lib\tools.jar;%XERCES%;%XALAN%;%BSF%;lib\ant.jar;lib\w3c.jar;lib
set ANT_HOME=.\lib

echo Building with classpath %LOCALCLASSPATH%

echo Starting Ant...

%JAVA_HOME%\bin\java.exe -Dant.home=%ANT_HOME% -classpath %LOCALCLASSPATH%;%CLASSPATH% org.apache.tools.ant.Main -buildfile build-jpfop.xml %1 %2 %3 %4 %5

goto end

:error

echo ERROR: JAVA_HOME not found in your environment.
echo Please, set the JAVA_HOME variable in your environment to match the
echo location of the Java Virtual Machine you want to use.

:end

rem set LOCALCLASSPATH=

