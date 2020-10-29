package tw.teddysoft.gof.Facade;


public class Scanner {

	public void warmup() throws ScannerException {
		// prepare the scanner to scan documents
	}

	public Image start() {
		// scan the document into an image
		return new Image();
	}
}
