package org.shankhs.solution;

public class USNewspaperLayoutFactory implements LayoutFactory {
    public FrontPageLayout createFrontPageLayout() {
        return new USFrontPageLayout();
    }

    public PoliticsPageLayout createPoliticsPageLayout() {
        return new USPoliticsPageLayout();
    }
}
