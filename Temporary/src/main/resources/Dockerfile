FROM centos:7.4.1708
RUN yum -y install unzip lksctp-tools libssh initscripts python-jinja2 PyYAML.x86_64 pytz.noarch python-lxml openssh-clients cronie logrotate libaio less gcc openssl-devel bzip2-devel libffi-devel zlib-devel wget make epel-release
RUN yum -y install python-pip && \
    wget https://www.python.org/ftp/python/3.9.6/Python-3.9.6.tgz && \
    tar xzf Python-3.9.6.tgz && \
    cd Python-3.9.6 && \
    ./configure --enable-optimizations && \
    make altinstall && \
    sed -i "s|python|python2|g" /usr/bin/yum && \
    rm /usr/bin/python && \
    ln -s /usr/local/bin/python3.9 /usr/bin/python
CMD /bin/bash