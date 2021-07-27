# LegacyCraftAgent

Java Agent that applies modded classes discretely into a loading Java application.

This can be used to JarMod anything, but will mostly be used by LegacyCraft to patch a loading game.

## Usage

- Add modified classes under the `classes` directory.
- Load application with the final JavaAgent jar with `-javaagent:path/to/final-javaagent-file.jar`