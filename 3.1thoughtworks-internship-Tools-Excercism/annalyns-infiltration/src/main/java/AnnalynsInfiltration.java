class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
        if (knightIsAwake) return false;
        return true;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
        int count = 0;
        if (knightIsAwake)count++;
        if (archerIsAwake)count++;
        if (prisonerIsAwake)count++;
        if (count > 0) return true;
        return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
        if (!archerIsAwake && prisonerIsAwake) return true;
        return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        // throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
        if (petDogIsPresent){
            if (!archerIsAwake)return true;
            return false;
        }
        else {
            if (prisonerIsAwake){
                if (!knightIsAwake && !archerIsAwake) return true;
                return false;
            }
            else return false;
        }
    }
}
