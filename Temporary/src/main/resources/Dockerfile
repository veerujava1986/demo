FROM centos:7.4.1708
RUN yum -y install gcc openssl-devel bzip2-devel libffi-devel zlib-devel wget make && \
    wget https://www.python.org/ftp/python/3.9.6/Python-3.9.6.tgz && \
    tar xzf Python-3.9.6.tgz && \
    cd Python-3.9.6 && \
    ./configure --enable-optimizations && \
    make altinstall && \
    cd /usr/bin && \
    rm python && \
    cd /usr/local/bin && \
    ln -s python3.9 python
CMD /bin/bash