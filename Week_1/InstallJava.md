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
