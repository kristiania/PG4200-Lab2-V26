import assignment.Search;

void main() {
    int[] arr = {10, 7, 11, 5, 13, 8, 38, 37, 14, 92, 84, 74, 77, 20, 40, 47, 33, 65, 62, 69, 73};
    int[] targets = {10,84,73,120};
    Search ls = new Search(arr);

    for(int elem : targets) {

        int result = ls.linearSearch(elem);

        if (result > -1) {
            IO.println(String.format("Item found at posistion %d", result));
        } else {
            IO.println("Element not found in list.");
        }
        int steps = ls.stepsLinearSearch(elem);
        IO.println(String.format("Linear Search took %d steps to complete.", steps));
    }

}