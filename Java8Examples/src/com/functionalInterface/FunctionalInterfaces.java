package com.functionalInterface;

public class FunctionalInterfaces {

	// Tek bir soyut metodu bulunan arayüzlere fonksiyonel arayüz denir. İki
	// veya üç değil,
	// yalnızca bir tane soyut metodu olmalı.

	public static void main(String[] args) {
		Foo foo = (x, y) -> (2 * x + y);
		int sonuc = foo.apply(3, 4);
		System.out.println("Sonuç: " + sonuc); // Çıktı: 10
	}
}

@FunctionalInterface
// Opsiyonel
interface Foo {

	int apply(int x, int y);

}