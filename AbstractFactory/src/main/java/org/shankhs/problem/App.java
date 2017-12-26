package org.shankhs.problem;

public class App {
    public static void main(String[] args) {
        FrontPageLayout frontPageLayout = new USFrontPageLayout();
        PoliticsPageLayout politicsPageLayout = new USPoliticsPageLayout();

        printPaper(frontPageLayout, politicsPageLayout);

        frontPageLayout = new IndiaFrontPageLayout();
        politicsPageLayout = new USPoliticsPageLayout();

        printPaper(frontPageLayout, politicsPageLayout);

        // Prints
        // Drawing front page layout of US.
        // Drawing politics page layout of US.
        // Drawing front page layout of India.
        // Drawing politics page layout of US.

        // Also possible:

        frontPageLayout = new USFrontPageLayout();
        politicsPageLayout = new IndiaPoliticsPageLayout();
        // This does not make sense but there are no checks here.
        // If the newspaper is published in US then it should have US related
        // politics page.
        printPaper(frontPageLayout, politicsPageLayout);

        // Prints:
        // Drawing front page layout of US.
        // Drawing politics page layout of India.
    }

    private static void printPaper(FrontPageLayout frontPageLayout,
                                   PoliticsPageLayout politicsPageLayout) {
        frontPageLayout.draw();
        politicsPageLayout.draw();
    }
}
