package homework5;

// Java program for the above approach

public class GFG {

//        // Utility function to get the ASCII
//        // value of the character at index d
//        // in the string
//        static int char_at(String str, int d)
//        {
//            if (str.length() <= d)
//                return -1;
//            else
//                return (int)(str.charAt(d));
//        }
//
//        // Function to sort the array using
//        // MSD Radix Sort recursively
//        static void MSD_sort(String str[], int lo, int hi,
//                             int d)
//        {
//            // Recursive break condition
//            if (hi <= lo) {
//                return;
//            }
//
//            // Stores the ASCII Values
//            int count[] = new int[256 + 1];
//
//            // Temp is created to easily
//            // swap strings in str[]
//            HashMap<Integer, String> temp = new HashMap<>();
//
//            // Store the occurrences of the most
//            // significant character from
//            // each string in count[]
//            for (int i = lo; i <= hi; i++) {
//                int c = char_at(str[i], d);
//                count++;
//            }
//
//            // Change count[] so that count[]
//            // now contains actual position
//            // of this digits in temp[]
//            for (int r = 0; r < 256; r++)
//                count[r + 1] += count[r];
//
//            // Build the temp
//            for (int i = lo; i <= hi; i++) {
//                int c = char_at(str[i], d);
//                temp.put(count++, str[i]);
//            }
//
//            // Copy all strings of temp to str[],
//            // so that str[] now contains
//            // partially sorted strings
//            for (int i = lo; i <= hi; i++)
//                str[i] = temp.get(i - lo);
//
//            // Recursively MSD_sort() on each
//            // partially sorted strings set to
//            // sort them by their next character
//            for (int r = 0; r < 256; r++)
//                MSD_sort(str, lo + count[r],
//                        lo + count[r + 1] - 1, d + 1);
//        }
//
//        // Function to print an array
//        static void print(String str[], int n)
//        {
//            for (int i = 0; i < n; i++) {
//                System.out.print(str[i] + " ");
//            }
//            System.out.println();
//        }
//
//        // Driver Code
//        public static void main(String[] args)
//        {
//
//            // Input String
//            String str[] = { "midnight", "badge", "bag",
//                    "worker", "banner", "wander" };
//
//            // Size of the string
//            int n = str.length;
//
//            System.out.print("Unsorted array : ");
//
//            // Print the unsorted array
//            print(str, n);
//
//            // Function Call
//            MSD_sort(str, 0, n - 1, 0);
//
//            System.out.print("Sorted array : ");
//
//            // Print the sorted array
//            print(str, n);
//        }
    }

// This code is contributed by Kingash.

