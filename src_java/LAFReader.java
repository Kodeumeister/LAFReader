/*
	=== LICENCE HEADER ===

	Copyright 2019 William Kimberley (Kodeumeister [kodeumeister98@gmail.com])

	Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

	The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/
package kodeumeister.io;

// STDLIB Imports
import java.io.File;
import java.io.IOException;
// Third-party Libs
import cz.adamh.utils.NativeUtils;

public class LAFReader
{
	static
	{
		try
		{
			NativeUtils.loadLibraryFromJar("/native-libs/libLAFR.lib");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	// --- Constructors ---
	// Constructor with Filename
	public LAFReader(String filename, String mode)
	{
		openFile(filename, mode);
	}
	
	// Constructor with File
	public LAFReader(File file, String mode)
	{
		this(file.getName(), mode);
	}
	
	// --- Native Methods ---
	public native void openFile(String filename, String mode);
	public native long getFileSize();
	public native long getFilePos();
	public native int read(byte[] buffer);
	public native int read(byte[] buffer, int offset, int length);
	public native void seek(long pos);
	public native void skipBytes(long numBytes);
	public native long readNumBE(long len);
	public native long readNumLE(long len);
	public native long writeNumBE(long num);
	public native long writeNumLE(long num);
	public native String readASCII();
	public native void writeASCII(String str);
	public native String readUTF();
	public native void writeUTF(String str);
	public native void close();
}