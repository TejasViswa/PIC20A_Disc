# Install Java

- To install JAVA together with an IDE (in case you want one) in the quickest way possible, download Visual Studio Code from [VSCode](https://code.visualstudio.com/download).
- After opening Visual StudioCode, select “Extensions” from the left hand side (the 5-th icon down at the time of writing).
- Search for and install “Extension Pack for Java”.
- After the install is complete, you’ll be prompted to installa JDK. (If you’re not prompted to do so, you can go to “View” (at the top), followed by “CommandPalette...”, and type “Java: Install New JDK”.)
- Then you will be asked to determine some of the settings of JDK. You can choose as suggested by the following:
  - We’re happy with Adoptium’s Temurin.
  - Select Version 11 (LTS).
  - For JVM, we’re fine with Hotspot.
- After the install, restart Visual Studio Code.
- You can check your installation by:
  - selecting “Terminal”(at the top), followed by “New Terminal”, and typing `java -version`.
  - Hopefully you’ll see...
  ```
  openjdk version "11.0.18" 2023-01-17
  OpenJDK Runtime Environment Temurin-11.0.18+10 (build 11.0.18+10)
  OpenJDK 64-Bit Server VM Temurin-11.0.18+10 (build 11.0.18+10, mixed mode)
  ```
  
# Creating a Java Project  

https://user-images.githubusercontent.com/45400093/229691633-603d6447-491b-469a-8cb0-2469a7a4dae4.mp4

You can also create a Java project using the Java: Create Java Project command. Bring up the Command Palette (⇧⌘P) and then type java to search for this command. After selecting the command, you will be prompted for the location and name of the project. You can also choose your build tool (slect no build tools) from this command.

[Reference](https://code.visualstudio.com/docs/java/java-tutorial)

# FAQ

1. How do I install the correct version of Java (Java 11) if I have installed some other version (say Java 17 or Java 8)?
  - Download JDK 11
    - If you want to download a new JDK, you can trigger the command Java: Install New JDK in Command Palette (CMD + Shift + P for MacOS) or (Ctrl + Shift + P for Windows). It will open a new view guiding you to download JDKs.
    - ![image](https://user-images.githubusercontent.com/45400093/229933309-9d6e309f-b5ba-4854-8fd7-61e9806e1669.png)
    - Select Java version 11 here and download ans install (Click continue & next everywhere and install the JDK)
  - Select “Terminal”(at the top), followed by “New Terminal”, and type the following:
    - For MacOS:
      - Type `/usr/libexec/java_home -V`
      - Your output should look like:
      ```
      Matching Java Virtual Machines (2):
      17.0.6 (arm64) "Eclipse Adoptium" - "OpenJDK 17.0.6" /Library/Java/JavaVirtualMachines/temurin-17.jdk/Contents/Home
      11.0.17 (arm64) "Eclipse Adoptium" - "OpenJDK 11.0.17" /Library/Java/JavaVirtualMachines/temurin-11.jdk/Contents/Home
      /Library/Java/JavaVirtualMachines/temurin-17.jdk/Contents/Home
      ```
      - Switch to 11 by inputting the following:
      ```
      export JAVA_HOME=`/usr/libexec/java_home -v 11.0`
      ```
    - For Windows:
      - Type (Find the path where your JDK 11 was installed and replace it in the following code snippet):
      ```
      set JAVA_HOME= <Your path to JAVA version 11>
      set PATH=%JAVA_HOME%\bin;%PATH%
      ```
      - Another method is - Look at the first answer in this [link](https://superuser.com/questions/262757/changing-current-version-of-java-within-windows) but replace it with the location where your JDK 11 was installed.
2. What do I do if there if the workspace is not trusted and I'm not able to access the commands from the extension (ie: I'm not able to Create a new Java project from the command pallete)?
- Follow the instructions in this [link](https://code.visualstudio.com/docs/editor/workspace-trust#_enabling-extensions)

In general, quit and relaunch your VSCode, uninstall and reinstall the entension or uninstall and reinstall VSCode to fix minor bugs, etc.
