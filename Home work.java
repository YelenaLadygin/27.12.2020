  /* 1. input array size from user
        create int array in the given size
        populate the array with random numbers
        sum the array
        print the average number
 */
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter the size of array : ");
        int[] array1 = new int[s.nextInt()];
        Random r = new Random();
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = r.nextInt(100) + 1;
            sum = sum + array1[i];
        }
            System.out.println(String.format(" Average of array is : %d:", sum / array1.length));
            
  /*    2. create an array of 5 Strings (hint: String[] word = new String[5])
        create a for loop and input words from the user into the array
        now print the array in a for loop
*/

        Scanner s = new Scanner(System.in);
        String[] array_world = new String[5];
        System.out.println("Enter 5 worlds :");
        for ( int i= 0; i< array_world.length; i++ ) {
            array_world[i] = s.next();;
        }
            for ( int i = 0 ; i < array_world.length; i++);{
            System.out.print (Arrays.toString(array_world ));
        } 
        
 /* 3. create int array A with random numbers (size of 5)
        create int array B with random numbers (size of 5)
        create int array C (size of 5) which each element will be the sum of A+B
        for exmaple:
        A [ 5, 8, 6, 2, 3]  -- random
        B [ 3, 7, 8, 3, 1]  -- random
        C [ 8,15,14, 5, 4]  -- sum
  */     
        Random r = new Random();
        int [] A = new  int [5];
        int [] B = new  int [5];
        int [] C = new  int [5];

        for ( int i= 0; i< C.length; i++ ) {
            A[i] = r.nextInt(100);
            B[i] = r.nextInt(100);
            C[i] = A [i] + B[ i];
        }
        System.out.println (Arrays.toString(A));
        System.out.println (Arrays.toString(B));
        System.out.println (Arrays.toString(C));
        
 // *etgar: create int array D which will contain the larger name from A or B
        Random r = new Random();
        int [] A = new  int [5];
        int [] B = new  int [5];
        int [] E = new  int [5];

        for ( int i= 0; i< E.length; i++ ) {
            A[i] = r.nextInt(100);
            B[i] = r.nextInt(100);
            if ( A[i] > B[i])
            E[i] = A [i];
            else
            E[i] = B[ i];
        }
        System.out.println (Arrays.toString(A));
        System.out.println (Arrays.toString(B));
        System.out.println (Arrays.toString(E));
        
// *etgar: create in array E which will be concat of the array A and B     *E[ 5, 8, 6, 2, 3, 3, 7, 8, 3, 1]
        Random r = new Random();
        int[] A = new int[5];
        int[] B = new int[5];
        int[] E = new int[A.length + B.length];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            A[i] = r.nextInt(100) + 1;
            E[i] = A[i];
            count++;
        }
        for (int j = 0; j < B.length; j++) {
            B[j] = r.nextInt(100) + 1;
            E[count++] = B[j];
        }
        for (int i = 0; i < E.length; i++)
            System.out.print(E[i] + " ");
    }

 
