public interface Visitor {
    void visitTextPost(TextPost textPost);
    void visitImagePost(ImagePost imagePost);
    void visitVideoPost(VideoPost videoPost);
}
