package basic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FromDirectoryExample {
	public static void main(String[] args) {
		Path path = Paths.get("c:/program files");
		try {
			Stream<Path> stream = Files.list(path);
//			stream.forEach( t -> System.out.println(t.getFileName()));
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//file
//		path = Paths.get(".project"); // StreamProject 하위 ..root 디렉토리
		path = Paths.get("src/listData.txt");
//		path = Paths.get("src/basic/FromDirectoryExample.java");
		try {
			Stream<String> strStream = Files.lines(path);
			strStream.forEach(t->System.out.println(t.toString()));
			strStream.forEach(System.out::println);
			strStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
