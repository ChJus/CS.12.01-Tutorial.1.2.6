public class Mountain {
  /**
   * @param array an array of positive integer values
   * @param stop  the last index to check
   *              Precondition: 0 <= stop < array.length
   * @return true if for each j such that 0 <= j < stop, array[j] < array[j + 1] ;
   * false otherwise
   */
  public static boolean isIncreasing(int[] array, int stop) {
    for (int i = 0; i < stop; i++) {
      if (array[i] >= array[i + 1]) return false;
    }
    return true;
  }

  /**
   * @param array an array of positive integer values
   * @param start the first index to check
   *              Precondition: 0 <= start < array.length - 1
   * @return true if for each j such that start <= j < array.length - 1,
   * array[j] > array[j + 1];
   * false otherwise
   */
  public static boolean isDecreasing(int[] array, int start) {
    for (int i = start; i < array.length - 1; i++) {
      if (array[i] <= array[i + 1]) return false;
    }
    return true;
  }

  // Finds the first index of a peak (an element greater than its neighbors)
  public static int getPeakIndex(int[] array) {
    // Loop through each element from the second to the (n-1)th element in
    // the array (with length n).
    for (int i = 1; i < array.length - 1; i++) {
      // If it is greater than its neighbors, return the index
      if (array[i - 1] < array[i] &&
          array[i] > array[i + 1]) return i;
    }
    return -1; // No match
  }

  public static boolean isMountain(int[] array) {
    // Check if array is 'mountain'.
    // Note that the iteration starts at index 1 to ensure
    // that matches found have an increasing range before
    // being followed by the decreasing range.
    for (int i = 1; i < array.length; i++) {
      if (isIncreasing(array, i) &&
          isDecreasing(array, i)) return true;
    }
    return false;
  }
}