package check;

//constantsパッケージを指定
import constants.Constants;

public class Check {

    //フィールド変数にprivateのアクセス修飾子でfirstNameとlastNameを作成
    private String firstName  = "宇内";
    private String lastName   = "和大";

    //フィールド変数のfirstNameとlastnameを連結したprintNameメソッドを作成。
    private void printName() {
        System.out.println("printNameメソッド ➡ ︎" + firstName + lastName);
    }

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        //Checkクラスをインスタンス化
        Check ch = new Check();
        //Checkクラス内のprintNameメソッドを出力
        ch.printName();

        //Petクラスをインスタンス化して、引数としてConstantsクラスの変数を使用
        Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
        //Petクラスのintroduceメソッドを出力
        pet.introduce();
        //RobotPetクラスをインスタンス化して、引数としてConstantsクラスの変数を使用
        RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
        //RobotPetクラスのintroduceメソッドを出力
        robotPet.introduce();

    }

}
