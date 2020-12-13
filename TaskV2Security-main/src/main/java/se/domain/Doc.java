package se.domain;

import org.springframework.web.multipart.MultipartFile;

public class Doc {
    private MultipartFile doc;
    private String name;

    @Override
    public String toString() {
        return "Doc{" +
                "doc=" + doc +
                ", name='" + name + '\'' +
                '}';
    }

    public MultipartFile getDoc() {
        return doc;
    }

    public void setDoc(MultipartFile doc) {
        this.doc = doc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
