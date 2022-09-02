
class RSA {
    char[] symbols = new char[] { 
    '#', ' ', '.', ',', '/', '?', '!', '@', '\'','"',
    '@', '№', '$', ';', '%', '^', ':', '&', '*', '(', 
    ')', '-', '_', '=', '+', '~', '`', '{', '}', '<', 
    '>', '[', ']', '|', '\\',

    'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
    'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
    'u', 'v', 'w', 'x', 'y', 'z',
    'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
    'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
    'U', 'V', 'W', 'X', 'Y', 'Z',

    'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 
    'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 
    'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь',
    'э', 'ю', 'я',
    'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 
    'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 
    'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ы', 'Ъ',
    'Э', 'Ю', 'Я',

    '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };

    long P_a = 131;
    long Q_a = 227;
    long P_b = 113;
    long Q_b = 281;
    long d_a = 3;
    long d_b = 3;
    
    public static void main(String[] args) {
        System.out.println(
            "Hi! This programm can encrypt and decrypt something using RSA.\n" +
            "Please write something text in file text.txt \n" +
            "I encrypt this text using RSA into cod.txt file \n" +
            "After that I decrypt cod to text into res.txt file ");
    }
}