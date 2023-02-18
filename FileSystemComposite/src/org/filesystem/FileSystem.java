package org.filesystem;

import java.util.List;

public interface FileSystem {
    void addFS(FileSystem fs);

    void removeFS(FileSystem fs);

    List<FileSystem> getFiles();

    String getName();

    int getSize();

    void print(String indent);
}