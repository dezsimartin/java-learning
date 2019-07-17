public class Main {

    public static void main(String[] args) {

        //min(args);
        //max(args);
        //System.out.println(sum(args));
        //System.out.println(avg(args));
        //    minMax(args);
        //countPositive(args);
        //countNegative(args);
        //countZero(args);
        // sumOddOrEven(args);
        //numbersXtoY(args);
        //arithmeticSequence(args);
        //geometricSequence(args);
        //fiboSequence(args);
        // word(args);
        //triangle(args);
        //cube(args);
        //ascOrDesc(args);
        //order(args);
        //polygon(args);
        //longestWord(args);
        //calculator(args);
    }

    public static void min(String... args) {
        int min = Integer.parseInt(args[0]);
        if (args.length <= 1) {
            System.out.println("Nincs elég bemeneti paraméter");
        } else {
            for (int i = 1; i < args.length; i++) {
                int num = Integer.parseInt(args[i]);
                if (min > num) {
                    min = num;
                }
            }
        }
        System.out.println(min);
    }

    public static void max(String... args) {
        int max = Integer.parseInt(args[0]);
        if (args.length <= 1) {
            System.out.println("Nincs elég bemeneti paraméter");
        } else {
            for (int i = 1; i < args.length; i++) {
                int num = Integer.parseInt(args[i]);
                if (max < num) {
                    max = num;
                }
            }
        }
        System.out.println(max);
    }

    public static int sum(String... args) {
        int sum = 0;
        if (args.length <= 1) {
            System.out.println("Nincs elég bemeneti paraméter");
        } else {
            for (int i = 0; i < args.length; i++) {
                int num = Integer.parseInt(args[i]);
                sum += num;
            }
        }
        return sum;
    }

    public static double avg(String... args) {
        double sum = 0;
        if (args.length <= 1) {
            System.out.println("Nincs elég bemeneti paraméter");
        } else {
            for (int i = 0; i < args.length; i++) {
                double num = Double.parseDouble(args[i]);
                sum += num;
            }

        }
        double avg = sum / args.length;

        return avg;
    }

    public static void minMax(String... args) {
        int max;
        int min;
        if (args.length <= 1) {
            System.out.println("Nincs elég bemeneti paraméter");
        } else {
            for (int i = 0; i < args.length; i++) {
                int num = Integer.parseInt(args[i]);
                if (i == 0 && num >= 0) {
                    min = num;
                } else if (i == 0 && num < 0) {
                    max = num;
                }
            }

        }
        System.out.println();
    }

    public static void countPositive(String... args) {
        int count = 0;
        if (args.length == 0) {
            System.out.println("Nem adtál meg paramétert");
        } else {
            for (int i = 0; i < args.length; i++) {
                int num = Integer.parseInt(args[i]);
                if (num >= 0) {
                    count++;
                }
            }
            System.out.println("Paraméterként kapott pozitiv számok száma: " + count);
        }
    }

    public static void countNegative(String... args) {
        int count = 0;
        if (args.length == 0) {
            System.out.println("Nem adtál meg paramétert");
        } else {
            for (int i = 0; i < args.length; i++) {
                int num = Integer.parseInt(args[i]);
                if (num < 0) {
                    count++;
                }
            }
            System.out.println("Paraméterként kapott negatív számok száma: " + count);
        }
    }

    public static void countZero(String... args) {
        int count = 0;
        if (args.length == 0) {
            System.out.println("Nem adtál meg paramétert");
        } else {
            for (int i = 0; i < args.length; i++) {
                int num = Integer.parseInt(args[i]);
                if (num == 0) {
                    count++;
                }
            }
            System.out.println("Paraméterként kapott 0 értékkel rendelkező számok száma: " + count);
        }
    }

    public static void sumOddOrEven(String... args) {
        int sumodd = 0;
        int sumeven = 0;
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (num % 2 == 0) {
                sumeven += num;
            } else {
                sumodd += num;
            }
        }
        if (sumeven > sumodd) {
            System.out.println("Páros számok összege: " + sumeven);
        } else {
            System.out.println("Páratlan számok összege: " + sumodd);
        }
    }

    public static void numbersXtoY(String... args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        if (args.length < 2 || x >= y) {
            System.out.println("Nem megfelelő paraméterek.");
        } else {
            for (int i = x + 1; i < y; i++) {
                System.out.println(i);
            }
        }
    }

    public static void arithmeticSequence(String... args) {
        int start = Integer.parseInt(args[0]);
        int diff = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);
        int[] array = new int[n + 1];
        if (args.length != 3) {
            System.out.println("Nem megfelelő paraméterek");
        } else {
            for (int i = 0; i <= n; i++) {
                if (i == 0) {
                    array[0] = start;
                    System.out.println(array[0]);
                } else {
                    array[i] = array[i - 1] + diff;
                    System.out.println(array[i]);
                }
            }
        }

    }

    public static void geometricSequence(String... args) {
        int start = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);
        int[] array = new int[n + 1];
        if (args.length != 3) {
            System.out.println("Nem megfelelő paraméterek");
        } else {
            for (int i = 0; i <= n; i++) {
                if (i == 0) {
                    array[0] = start;
                    System.out.println(array[0]);
                } else {
                    array[i] = array[i - 1] * q;
                    System.out.println(array[i]);
                }
            }
        }

    }

    public static void fiboSequence(String... args) {
        int n = Integer.parseInt(args[0]);
        int[] array = new int[n + 1];
        if (args.length != 1) {
            System.out.println("Nem megfelelő paraméterek");
        } else {
            array[0] = 0;
            array[1] = 1;
            for (int i = 2; i <= n; i++) {
                array[i] = array[i - 1] + array[i - 2];
                System.out.println(array[i]);

            }
        }

    }

    public static void word(String... args) {
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        for (int i = 0; i < args.length; i++) {
            int l = args[i].length();
            array[l] = array[l - 1] + 1;

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " hosszúságú: " + array[i] + "db ");

        }
    }

    public static void triangle(String... args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int k, s;
        double t;
        if (args.length != 3) {
            System.out.println("Hibás paraméter");
        } else if (a + b > c || a + c > b || b + c > a) {
            k = a + b + c;
            s = k / 2;
            double ds = s;
            double da = a;
            double db = b;
            double dc = c;
            t = Math.sqrt(ds * (ds - da) * (ds - db) * (ds - dc));
            System.out.println("Kerület: " + k);
            System.out.println("Terület: " + t);
        }
    }

    public static int getRandomInteger(int max, int min) {
        return ((int) (Math.random() * (max - min))) + min;
    }

    public static void cube(String... args) {
        if (args == null) {
            System.out.println("Nincs bemenet.");
        }
        double n = Integer.parseInt(args[0]);
        int random;
        int[] count = {0, 0, 0, 0, 0, 0};
        for (int i = 0; i < n; i++) {
            random = getRandomInteger(6, 1);
            count[random - 1] = count[random - 1] + 1;
        }
        double percent;
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                percent = (count[i] / n) * 100;
                System.out.println(i + 1 + " dobások száma: " + count[i] + ". Százalék: " + percent);
            } else {
                System.out.println(i + 1 + " dobások száma: " + count[i] + ". Százalék: 0");
            }
        }
    }

    public static void ascOrDesc(String... args) {
        if (args.length < 2) {
            System.out.println("nincs elég param");
        } else {
            for (int i = 1; i < args.length; i++) {
                if (Integer.parseInt(args[i]) < Integer.parseInt(args[i - 1])) {
                    if (i == args.length - 1) {
                        System.out.println("desc");
                    }
                } else if (Integer.parseInt(args[i]) > Integer.parseInt(args[i - 1])) {
                    if (i == args.length - 1) {
                        System.out.println("asc");
                    }
                } else {
                    if (i == args.length - 1) {
                        System.out.println("egyik sem");
                    }
                }
            }
        }
    }

    public static void order(String... args) {
        int sum = 0;
        int i = 0;
        if (args.length < 1) {
            System.out.println("Nincs elég paraméter");
        } else {
            while (i < args.length) {
                switch (Integer.parseInt(args[i])) {
                    case 1:
                        sum += 1000;
                        break;
                    case 2:
                        sum += 5000;
                        break;
                    case 3:
                        sum += 7000;
                        break;
                    case 4:
                        sum += 9000;
                        break;
                    default:
                        System.out.println("Nem megfelelő rendelésszám.");
                        break;
                }
                i++;
            }
            System.out.println("Rendelés összege: " + sum);
        }
    }

    public static void polygon(String... args) {
        int sides = Integer.parseInt(args[0]);
        int l = Integer.parseInt(args[1]);
        int sum = 0;
        if (args.length != 2) {
            System.out.println("nem két bemenet");
        } else {
            for (int i = 0; i < sides; i++) {
                sum += l;
            }
            System.out.println("Kerület: " + sum);
        }
    }

    public static void longestWord(String... args) {
        String l = "A";
        for (int i = 0; i < args.length; i++) {
            if (args[i].length() > l.length()) {
                l = args[i];
            }
        }
        System.out.println("A leghosszabb szó: " + l);
    }

    public static void calculator(String... args) {
        int x = Integer.parseInt(args[0]);
        String o = args[1];
        int y = Integer.parseInt(args[2]);
        int res;
        if (args.length != 3) {
            System.out.println("nem jó param");
        } else {
            switch (o) {
                case "+":
                    res = x + y;
                    System.out.println("Eredmény: " + res);
                    break;
                case "-":
                    res = x - y;
                    System.out.println("Eredmény: " + res);
                    break;
                case "/":
                    res = x / y;
                    System.out.println("Eredmény: " + res);
                    break;
                case "x":
                    res = x * y;
                    System.out.println("Eredmény: " + res);
                    break;
                default:
                    System.out.println("Helytelen operátor.");
                    break;
            }

        }
    }

    public static void calculatorExtended(String... args) {
        int x = Integer.parseInt(args[1]);
        for (int i = 3; i < args.length; i++) {
            switch (args[i - 1]) {
                case "+":
                    x = x + Integer.parseInt(args[i - 2]);
                    break;
                case "-":
                    x = x - Integer.parseInt(args[i - 2]);
                    break;
                case "/":
                    x = x / Integer.parseInt(args[i - 2]);
                    break;
                case "x":
                    x = x * Integer.parseInt(args[i - 2]);
                    break;
                default:
                    break;
            }

        }
    }
}
