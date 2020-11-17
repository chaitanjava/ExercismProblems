class RnaTranscription {

    String transcribe(String dnaStrand) {

        if (dnaStrand.isEmpty())
            return "";

        for (int i = 0; i < dnaStrand.length(); i++) {
            char letter = dnaStrand.charAt(i);
            if (letter == 'G') {
                letter = 'C';
            } else if (letter == 'C') {
                letter = 'G';
            } else if (letter == 'T') {
                letter = 'A';
            } else if (letter == 'A') {
                letter = 'U';
            }

            System.out.println(letter);
        }
        return null;

    }
}
