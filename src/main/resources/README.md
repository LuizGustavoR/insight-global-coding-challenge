# Insight Global - Coding Challenge

# Project Setup Guide

This guide will walk you through setting up and running a Java 11 Maven project in IntelliJ IDEA.

## Prerequisites

Make sure you have the following installed on your system:

- [Java 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
- [Maven](https://maven.apache.org/download.cgi) (Make sure it's installed and added to your system's PATH)

## Project Setup

1. **Clone the Repository:** Start by cloning the project repository from GitHub using Git or by downloading it as a ZIP archive.

2. **Open IntelliJ IDEA:**
    - Launch IntelliJ IDEA.
    - Click on "Open" and navigate to the project directory you just cloned/downloaded. Select the directory and click "Open."

3. **Configure Java 11:**
    - Open the "File" menu and select "Project Structure."
    - Under "Project," ensure that the "Project SDK" is set to Java 11. If not, click on "New" and select the path to your Java 11 installation.

4. **Import as Maven Project:**
    - IntelliJ IDEA should automatically detect the project as a Maven project. If not, click on "File" > "Project Structure" > "Modules."
    - Click on the "+" button and select "Import Module." Navigate to the project's `pom.xml` file and select it.

5. **Install Dependencies:**
    - After importing the project, IntelliJ IDEA will automatically download and install the project's dependencies specified in the `pom.xml` file.

## Running the Main File

6. **Run the Main Class:**
    - Locate the `RemoveDuplicatesTest.java` file in the project structure.
    - Right-click on the `RemoveDuplicatesTest.java` file and select "Run RemoveDuplicatesTest" This will execute the tests.
