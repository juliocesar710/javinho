import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      Scanner scan = new Scanner(System.in);

      int n = scan.nextInt();
      int m = scan.nextInt();
      int[][] mat = new int[n][m];

      for(int i = 0;i<mat.length;i++){
        for(int j = 0;j<mat[i].length;j++){
            mat[i][j] = scan.nextInt();
        }
      }
      int x = scan.nextInt();

       for(int i = 0;i<mat.length;i++){
        for(int j = 0;j<mat[i].length;j++){
           if(x == mat[i][j]){
            System.out.println("localização: "+i+","+j);
            System.out.println("esquerda: "+mat[i][j-1]);
            System.out.println("direita: "+mat[i][j+1]);
            System.out.println("cima: "+mat[i-1][j]);
            System.out.println("baixo: "+mat[i+1][j]);
        
           }
        }
      }
    
    }

    private void method1(){

        System.out.print("Insira o nímeros de pessoas: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        double[] vet = new double[n];
        double sum = 0;
        for(int i=0;i<n;i++){
            System.out.print("Insira sua altura: ");
            vet[i] = scan.nextDouble(); 
            sum+=vet[i];
        }

        double media = sum/n;

        System.out.printf("Médias das alturas: %.2f",media);
    }

    private void method2(){
        Scanner scan = new Scanner(System.in);
     
        System.out.print("Digite a quantidade produtos: ");
        int n = scan.nextInt();
        Product[] vet = new Product[n];
        double sum = 0;
        for(int i = 0;i<vet.length;i++){
            scan.nextLine();
            System.out.print("\nDigite o nome do produto: ");
            String name = scan.nextLine();
            System.out.print("Digite o preço do produto: ");
            double price = scan.nextDouble();
            
            vet[i] = new Product(name, price);
            sum+=vet[i].getPrice();
        }

        double media = sum/vet.length;

        System.out.printf("\nMedia dos produtos: %.2f",media);
    }

    private void method3(){
         Scanner scan = new Scanner(System.in);

        System.out.print("Indique quantos número irá digitar: ");
        int n = scan.nextInt();
        int[] vet = new int[n];
      

        for(int i = 0; i<vet.length;i++){
            System.out.print("Digite um número: ");
            vet[i] = scan.nextInt();
        }

        System.out.println("Numeros Negativos:");

        
        for(int i = 0; i<vet.length;i++){
           if(vet[i]<0)System.out.println(vet[i]);
        }
        
    }

    private void method4(){
         Scanner scan = new Scanner(System.in);

       System.out.print("quantos pessoas serão lidas? ");
       int n = scan.nextInt();

       String[] nomes = new String[n];
       int[] idades = new int[n];
       double[] alturas = new double[n];
       int count = 0;

       for(int i=0;i<n;i++){
        System.out.println("Dados da "+(i+1)+"ª pessoa");
        System.out.print("Nome: ");
        nomes[i] = scan.next();
        System.out.print("Idade: ");
        idades[i] = scan.nextInt();
        System.out.print("Alturas: ");
        alturas[i] = scan.nextDouble();

        if(idades[i]<16)count++;
       }

       double porcent = count * 100.0 / n;

       double soma = 0;
       for(int i=0;i<n;i++){
        soma+=alturas[i];
       }

       double media = soma / n;

       System.out.println();
       System.out.printf("Altura media: %.2f%n",media);

       System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n",porcent);

       for(int i = 0;i<n;i++){
        if(idades[i]<16)System.out.println(nomes[i]);
       }

    }

     private void method5(){
          Scanner scan = new Scanner(System.in);

      Pessoa[] pessoas = new Pessoa[10];

      System.out.print("Quantos quartos serão alugados? ");
      int n = scan.nextInt();


      for(int i=0;i<n;i++){
        System.out.println("Aluguel #"+(i+1)+":");
        System.out.print("Name: ");
        scan.nextLine();
        String name = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Room: ");
        int roomNumber = scan.nextInt();
        

        pessoas[roomNumber] = new Pessoa(name, email);

        System.out.println();
       
      }
        System.out.println("Quartos ocupados: ");
        for(int i=0;i<pessoas.length;i++){
            if(pessoas[i]!=null) System.out.println(i+": "+pessoas[i]);


        }
     }

      private void method6(){
          Scanner scan = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz(Ex: matriz de ordem 2 digite: 2): ");
        int n = scan.nextInt();
        int[][] mat = new int[n][n];
        int count = 0;

        for(int i =0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                mat[i][j] = scan.nextInt();
                if(mat[i][j]<0)count++;
            }
        }


        System.out.println("Main diagonal: ");
        for(int i =0;i<mat.length;i++)System.out.print(mat[i][i]+" ");

        System.out.println("\nNumbers negative: "+count);

      }
    }


