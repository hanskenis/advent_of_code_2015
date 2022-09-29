all: clean run

day_01.jar: clean
	kotlinc day_01.kt -include-runtime -d day_01.jar
day_02.jar: clean
	kotlinc day_02.kt -include-runtime -d day_02.jar
day_03.jar: clean
	kotlinc day_03.kt -include-runtime -d day_03.jar

clean:
	rm -rf *.jar

day_01: day_01.jar
	java -jar day_01.jar < ../input/day_01.txt

day_02: day_02.jar
	java -jar day_02.jar < ../input/day_02.txt

day_03: day_03.jar
	java -jar day_03.jar < ../input/day_03.txt