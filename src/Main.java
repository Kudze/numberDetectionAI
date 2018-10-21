import kudze.machineLearning.layout.NeuralNetwork;
import kudze.machineLearning.test.NumberTest;

import java.util.Scanner;

/**
 * Created by Kudze on 10/21/2018.
 * <p>
 * All Rights Reserved by L5 Corp.
 */
public class Main {

    private static NeuralNetwork neuralNetwork;

    private static void teachNeuralNetwork(int tests, int gen, int starters, int rows, int[] rowNeurons) {
        Main.neuralNetwork = NumberTest.learn(tests, gen, starters, rows, rowNeurons);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sveiki atvykę į kudzės machine learningo pirmą parodymą.");
        System.out.println("Norėdamas sužinoti visas komandas, rašyk: komandos");

        while(true) {
            System.out.print("> ");
            String input = scanner.next().toLowerCase();
            switch(input) {
                case "komandos": {

                    System.out.println("Komandos: ");
                    System.out.println("komands - Parodo visas komandas!");
                    System.out.println("learn - Išmoko neural networką!");

                    break;
                }
                case "learn": {

                    System.out.print("Ivesk pavyzdžių kiekį: ");
                    int tests = scanner.nextInt();

                    System.out.print("Ivesk kartų kiekį: ");
                    int gen = scanner.nextInt();

                    System.out.print("Ivesk algoritmu kieki: ");
                    int algo = scanner.nextInt();

                    System.out.print("Ivesk pasleptų eilių kiekį: ");
                    int rows = scanner.nextInt();

                    int[] rowNeurons = new int[rows];
                    for(int i = 0; i < rows; i++) {
                        System.out.print("Ivesk " + (i + 1) + " eilės neuronų kiekį: ");
                        rowNeurons[i] = scanner.nextInt();
                    }

                    Main.teachNeuralNetwork(tests, gen, algo, rows, rowNeurons);

                    System.out.println("Neural networkas buvo išmokytas!");

                    break;
                }
                default: {
                    System.out.println("Ši komanda nebuvo rasta!");

                    break;
                }
            }
        }

    }

}
