public class PrintExportVisitor implements Visitor {
    @Override
    public void visitTextPost(TextPost textPost) {
        System.out.println("Text Post with ID=" + textPost.getId() +
                " has been read " + textPost.getDisplayCount() + " times! Text: " + textPost.getText());
    }

    @Override
    public void visitImagePost(ImagePost imagePost) {
        System.out.println("Image Post with ID=" + imagePost.getId() +
                " has been seen " + imagePost.getDisplayCount() + " times! Image: " + imagePost.getImage());
    }

    @Override
    public void visitVideoPost(VideoPost videoPost) {
        System.out.println("Video Post with ID=" + videoPost.getId() +
                " has been watched " + videoPost.getDisplayCount() + " times! Video: " + videoPost.getVideo());
    }
}
