package kodeumeister.io;

// STDLIB Imports
import java.io.File;
import java.io.IOException;
// Third-party Libs
import cz.adamh.utils.NativeUtils;

public class LAFReader implements LAFReaderInterface
{
	// Private Instance Fields
	private File file;
	private FileInputStream fis;
	
	// --- Constructors ---
	// Constructor with Filename
	public LAFReader(String filename, String mode)
	{
		fis = new FileInputStream(filename);
	}
	
	// Constructor with File
	public LAFReader(File file, String mode)
	{
		this(file.getName(), mode);
	}
	
	@Override
	public void close()
	{
		fis.close();
	}
}