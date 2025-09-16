# FileIndexer Example

An example app making use of the FileIndexer library to demonstrate file indexing and searching capabilities.

## Usage

### Build and run the project

```bash
./gradlew run
```

This will index the default `dummyDir` directory and display an inverted index showing which tokens appear in which files.

### Index specific files or directories

```bash
./gradlew run --args="path/to/your/file.txt"
./gradlew run --args="path/to/your/directory"
```

### Interactive search mode

Use the `--watch` flag to enable interactive search mode:

```bash
./gradlew run --args="--watch dummyDir"
./gradlew run --args="--watch /path/to/directory file1.txt file2.txt"
```

In interactive mode:
- The application will watch the specified files/directories for changes
- You can type search queries to find files containing specific words
- Press Ctrl+D to exit

### Examples

- Display inverted index of default dummy directory:
  ```bash
  ./gradlew run
  ```

- Search interactively in a specific directory:
  ```bash
  ./gradlew run --args="--watch /Users/username/Documents"
  ```

- Index multiple specific files and directories:
  ```bash
  ./gradlew run --args="file1.txt /path/to/dir file2.md"
  ```