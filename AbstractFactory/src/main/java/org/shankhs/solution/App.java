package org.shankhs.solution;

public class App {
    private static void draw(LayoutFactory factory) {
        draw(factory.createFrontPageLayout(),
             factory.createPoliticsPageLayout());
    }

    private static void draw(FrontPageLayout frontPageLayout,
                             PoliticsPageLayout politicsPageLayout) {
        frontPageLayout.draw();
        politicsPageLayout.draw();
    }

    public static void main(String[] args) {
        LayoutFactory factory = new USNewspaperLayoutFactory();
        draw(factory);

        factory = new IndiaNewspaperLayoutFactory();
        draw(factory);

        // Prints:
        // Drawing front page layout of US.
        // Drawing politics page layout of US.
        // Drawing front page layout of India.
        // Drawing politics page layout of India.

        // Note now it is not possible to have a Indian politics page in a US
        // newspaper.
    }
}
