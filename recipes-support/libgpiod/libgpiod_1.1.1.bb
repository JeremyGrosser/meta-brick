require recipes-support/libgpiod/libgpiod.inc

SRC_URI[md5sum] = "e5e946cb01a35e5046a1a7a108d6a96d"
SRC_URI[sha256sum] = "172fa1544ecb51f37533b3e67862298d50c0a5cc84975f3c0706dc15467f0dfd"

PACKAGECONFIG[python3] = "--enable-bindings-python,--disable-bindings-python,python3"
PACKAGECONFIG[cxx] = "--enable-bindings-cxx,--disable-bindings-cxx,"

PACKAGECONFIG += " python3"

DEPENDS += " autoconf-archive-native"

inherit python3native

FILES_${PN} += " \
    ${PYTHON_SITEPACKAGES_DIR}/gpiod.so \
    "

FILES_${PN}-staticdev += " \
    ${PYTHON_SITEPACKAGES_DIR}/gpiod.a \
    "
