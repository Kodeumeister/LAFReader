package kodeumeister.io;

public interface LAFReaderInterface
{
	public long getFileSize();
	public long getFilePos();
	public int read(byte[] buffer);
	public int read(byte[] buffer, int offset, int length);
	public void seek(long pos);
	public void skipBytes(long numBytes);
	public long readNumBE(long len);
	public long readNumLE(long len);
	public long writeNumBE(long num);
	public long writeNumLE(long num);
	public String readASCII();
	public void writeASCII(String str);
	public String readUTF();
	public void writeUTF(String str);
	public void close();
}