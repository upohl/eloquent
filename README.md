# Eloquent
<B>E</B>clipse <B>L</B>inear <B>O</B>ptimization, <B>Que</B>ry, '<B>n</B>' <B>T</B>ransformation

## Dependency Update Site for Neon.3:
* http://download.eclipse.org/modeling/mdt/ocl/updates/interim/6.3.0

## Eloquent Update Site:
* https://muml-build.cs.upb.de/job/ELOQUENT-Github/lastSuccessfulBuild/artifact/plugins/org.muml.eloquent.repository/target/repository

## Installing the tools for Eloquent 

Eloquent is a plug-in for Eclipse Neon.3 and Oxgen. We develop and test it under Eclipse installations for Windows 7, 10 and Linux;

### Java 
* For installing Eloquent, you need a Java Runtime Environment (JRE) or Java Development Kit (JDK) on your machine. We recommend using the latest version of Java 8 provided by Oracle.

### LPSolve
For solving the allocation problem, you need LPSolve on your machine.
* http://sourceforge.net/projects/lpsolve/

Furthermore, the installed software must be referred within the PATH environment variable.  

On Windows machines you need to do the following:

* Go to Control Panel --> System and Security --> System
* Click Advanced system settings
* Click Environment Variables
* In the System Variables area, locate the PATH variable, highlight it and click Edit...
* Make the required changes, e.g., Add "C:\Program Files (x86)\lp_solve", Click OK, OK, OK

You can test if LPSolve is available via typing in the command line (Run "cmd"): "lp_solve -h"

### Eloquent Installation 
Currently, we support the Eclipse Oxygen and Neon.3 release. Download one of the following releases
* Eclipse Oxygen Modeling Tools  [http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/oxygenr]
and unzip the contents of the zip-file into a folder of your choice. 
* Eclipse Neon Modeling Tools SR3 [http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/neon3]
and unzip the contents of the zip-file into a folder of your choice. 

1. In Eclipse, choose Help -> Install New Software from the menu. Make sure to enable the option "Contact all update sites during install to find required software".
1. (only for Neon.3 User) click "Add..." and enter the following information in the dialog: Name = OCL, Location = [http://download.eclipse.org/modeling/mdt/ocl/updates/interim/6.3.0]
1. click "Add..." and enter the following information in the dialog: Name = Eloquent, Location = [https://muml-build.cs.upb.de/job/ELOQUENT-Github/lastSuccessfulBuild/artifact/plugins/org.muml.eloquent.repository/target/repository]
1. After the list of features has been updated, choose at least "MechatronicUML ELOQUENT" from the "ELOQUENT" category.
1. Click "Next" to accept the features to be installed.
1. Click "Next" to accept the license agreements.
1. Click "Finish".
