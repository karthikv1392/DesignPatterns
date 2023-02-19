package org.filesystem;

public class File implements FileSystem {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void addFS(FileSystem fs) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeFS(FileSystem fs) {
        throw new UnsupportedOperationException();
    }

    @Override
    public java.util.List<FileSystem> getFiles() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + name + " (" + size + " bytes)");
    }
}
