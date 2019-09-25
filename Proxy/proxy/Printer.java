package proxy;

public class Printer implements Printable {
	private String name;
	public Printer() {
		heavyJob("Printerのインスタンスを生成");
	}
	public Printer(String name) {
		this.name = name;
		heavyJob("Printerのインスタンス(" + name + ")を生成中");
	}
	public void setPrinterName(String name) {
		this.name = name;
	}
	public String getPrinterName(String name) {
		return name;
	}
	public void print(String string) {
		System.out.println("=== " + name + " ===");
		System.out.println(string);
	}
	private void heavyJob(String msg) {
		System.out.print(msg);
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
			}
			System.out.print(".");
		}
		System.out.println("完了");
	}
}
