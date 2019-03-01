# LAFReader
A low abstraction file reader written in Java and C (using JNI), hence the acronym LAF. It's based loosely on RandomAccessFile in Java's standard library.

Note: This library is currently incomplete and will only compile the Java source and generate the C header file.

## How to Build
Apache Ant and GCC is required to build the project (GCC/MinGW needs to be included in PATH variable).

To build just type "ant", to clean type "ant clean".

## Credits
This library uses NativeUtils from the repository listed below. The library has already been compiled.
The license by NativeUtils is available to view in the "lib" folder.

NativeUtils Repo: https://github.com/adamheinrich/native-utils
