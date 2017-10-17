package chap05;
//Character自带了大量函数，判断是否为字母、数字或者空格
public class CharacterType {
    public static void main(String[] args)
    {
        Character c = 'x';//装箱
        char a = c;//拆箱
        System.out.println(Character.isLetter(c));
    }
}
