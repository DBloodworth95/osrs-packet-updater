# OSRS Packet Updater for Ethan's API

This project is a packet updater for Old School RuneScape (OSRS) that automatically updates the constants in Ethan's `ObfuscatedNames` class by reading patterns in the OSRS client. The primary purpose is to find the obfuscated names and update the API to reflect any changes in the client.

## Features

- Automatically updates obfuscated constants such as class names, field names, and method names in the OSRS client.
- Identifies key client structures like the packet writer, buffer methods, and session fields using pattern matching.
- Compatible with Ethan's API, ensuring seamless updates to `ObfuscatedNames`.

### Example Constants in `ObfuscatedNames`:

```java
public static final String INDEX_FIELD = "aa";
public static final String EVENT_MOUSE_CLICK_OBFUSCATEDNAME = "ci";
public static final String packetWriterClassName = "ed";
public static final String addNodeMethodName = "ak";
```

## How it works

The project works by scanning gamepack files (available in the `nonfree` directory) to locate specific patterns that correspond to obfuscated class and field names. It then updates the `ObfuscatedNames` class in Ethan's API with the newly discovered names.

Example: Finding the `addNodeMethodName`
- The `AddNodeMethodName` class uses a pattern searcher to find the method responsible for adding packet nodes.
- It looks for methods with a `try/catch` block followed by a specific method call pattern in the form of `this.x.x(var1);`, which identifies the obfuscated method.

## Usage

1. *Provide the Gamepack Path*: You need to supply the absolute path to the gamepack directory as a program argument. Gamepacks are located in the `nonfree` directory, e.g., `nonfree/gamepacks/225`, where `225` is the revision number of the OSRS client.
2. *Run the Updater:* The main entry point is the `ObfuscatedNameUpdater` class.

Example:

```bash
java -jar ObfuscatedNameUpdater.jar /path/to/nonfree/gamepacks/225
```

The updater will analyze the gamepack files and update the `ObfuscatedNames` class with the latest obfuscated constants.

## Requirements

- Java 11.

## Contributing

Feel free to open issues or submit pull requests if you find any bugs or have improvements to suggest. Contributions are welcome!
