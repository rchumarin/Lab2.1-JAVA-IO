import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		String line, fileNotFound;
		int num;
/*
		out.print("Применение фильтров. Укажите путь к файлу: ");
		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
		File file = new File(reader.readLine());
		fileNotFound = String.format(file.exists() ? "Абсолютный путь: " + file.getAbsolutePath(): "Файл не найден"); 
		out.println(fileNotFound);
*/
		File file = new File("./first.txt");
		System.out.println("Фильтр №1 - на экране печатаются только те строки файла где нету слова Путин");
		System.out.println("Фильтр №2 - на экране печатаются только те строки файла где есть слова Путин, но нет слома Медведев");
		System.out.print("Введите номер фильтра: ");
		num = System.in.read();
		
		try (BufferedReader filer = new BufferedReader(new FileReader(file))) {
			do {
				line = filer.readLine();
				Factory fact = new Factory();
				fact = fact.getFilter(num);
				fact.show(line);
			}
			while(line != null);
		}


	}
}