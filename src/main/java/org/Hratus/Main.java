package org.Hratus;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //A medida que o valor dobra, a busca binaria aumenta apenas 1 passo(steps), e a linear dobra
        Random rand = new Random();
        int nums[] = {rand.nextInt(1000)};

        int target = 10;
        int result = linearSearch(nums, target);
        int result2 = binarySearch(nums, target, 0 ,nums.length-1);

        if(result != -1) {
            System.out.println("Elemento encontrado: " + result2);

        }
        else {

            System.out.println("Elemento nao encontrado");
        }


    }

    //Busca Linear
    public static int linearSearch(int[] nums, int target) {
        int steps=0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("o numero de passos de busca linear foram: " + steps);
                return i;
            }
        }
        System.out.println("o numero de passos de busca linear foram: " + steps);
       return -1;

    }

    public static int binarySearch(int[] nums, int target, int left, int right) {
        //int esquerda = 0;
        //int direita = nums.length - 1;
        int steps = 0;

        if(left <= right) {
            int meio = (left + right) / 2;
            if (nums[meio] == target) {
                return meio;
            }
            //caso o meio foi menor que o alvo e o alvo e esteja a direita. A esqueda passa a ser o meio+1, removendo os numeros a esquerda do novo meio
            else if (nums[meio] < target) {
                return binarySearch(nums, target, meio+1,right);
            }
            //caso o alvo esteja a esquerda, a direita passa a ser o meio-1, removendo os numeros a direita do novo meio
            else {
                return binarySearch(nums, target, left,meio-1);
            }

        }










        //{5,6,7,8,9};
        //esquerda é o index inicial da matriz, direita é o ultimo index a partir do 0
        /*
        while (esquerda <= direita) {
            steps++;
            int meio = (esquerda + direita) / 2;
            //Se o meio for compadado com o algo, ele retorna o meio
            if (nums[meio] == target) {
                System.out.println("o numero de passos de busca binaria foram: " + steps);
                return meio;


            }
            //caso o meio foi menor que o alvo e o alvo e esteja a direita. A esqueda passa a ser o meio+1, removendo os numeros a esquerda do novo meio
            else if (nums[meio] < target) {
                esquerda = meio + 1;
            }
            //caso o alvo esteja a esquerda, a direita passa a ser o meio-1, removendo os numeros a direita do novo meio
            else {
                direita = meio - 1;
            }

        }



        System.out.println("o numero de passos de busca binaria foram: " + steps);
        return -1;

         */
        return -1;
    }
}