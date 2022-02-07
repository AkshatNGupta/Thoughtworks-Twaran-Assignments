class RnaTranscription {

    String transcribe(String dnaStrand) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String s = "";
        for (int i=0;i<dnaStrand.length();++i){
            char ch = dnaStrand.charAt(i);
            if (ch=='G') s+='C';
            else if (ch == 'C') s+='G';
            else if (ch == 'T') s+='A';
            else if (ch == 'A') s+='U';
        }
        return s;
    }

}
