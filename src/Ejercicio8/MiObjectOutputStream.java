package Ejercicio8;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MiObjectOutputStream extends ObjectOutputStream {

	MiObjectOutputStream() throws IOException{
		super();
		// TODO Apéndice de constructor generado automáticamente
	}
	
	public MiObjectOutputStream(OutputStream oos) throws IOException{
	super(oos);	
	}
	
	@Override
	protected void writeStreamHeader() throws IOException {
		
	}
}
