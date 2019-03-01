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
