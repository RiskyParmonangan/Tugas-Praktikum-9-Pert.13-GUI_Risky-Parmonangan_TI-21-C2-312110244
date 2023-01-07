import javax.swing.*;

class Main {
	public static void main(String[] args) {
		JFrame myFrame;

		myFrame = new JFrame();
		myFrame.setSize(500,400);
		myFrame.setVisible(true);

		JOptionPane.showMessageDialog(myFrame, "Hai , Selamat datang di penghitung usia");

		String name = JOptionPane.showInputDialog(myFrame, "Masukan Nama:");
		while (name.isEmpty()) {
			JOptionPane.showMessageDialog(myFrame, "Wajib mengisi nama anda...");
			name = JOptionPane.showInputDialog(myFrame, "Masukan Nama:");
		}

		String yearStr = JOptionPane.showInputDialog(myFrame, "Tahun Lahir:");
		while (yearStr.isEmpty()) {
			JOptionPane.showMessageDialog(myFrame, "Wajib untuk di isi...");
			yearStr = JOptionPane.showInputDialog(myFrame, "Tahun Lahir:");
		}
		int year = Integer.parseInt(yearStr);
		int age = 2022 - year;
		

		JOptionPane.showMessageDialog(myFrame, "Hai " + name + ", Usia mu " + age + " tahun.");
		myFrame.dispose();
	}
}