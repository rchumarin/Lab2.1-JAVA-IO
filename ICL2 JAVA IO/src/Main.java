import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		String line, fileNotFound; 
		int num;			 
		/*
		out.print("Применение фильтров. Укажите путь к файлу: ");
		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
		File file = new File(reader.readLine());
		 */
		File file = new File("./first.txt");
		if (!file.exists()) {
			System.out.println("Файл не найден"); 
			return;
		}
		System.out.println("Фильтр №1 - на экране печатаются только те строки файла где нету слова Путин");
		System.out.println("Фильтр №2 - на экране печатаются только те строки файла где есть слова Путин, но нет слома Медведев");
		System.out.print("Введите номер фильтра: ");
		num = System.in.read();	
		try (BufferedReader filer = new BufferedReader(new FileReader(file))) {
			Factory factory = new Factory();
			Filter filter = factory.getFilter(num);
			do {
				line = filer.readLine();
				if (filter.accept(line)) 
					System.out.println(line);
			}		
			while(line != null);
		}
	}
}
