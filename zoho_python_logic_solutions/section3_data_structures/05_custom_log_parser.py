logs = "ERROR: Disk full\nINFO: System rebooted\nERROR: Out of memory"
for line in logs.split("\n"):
    if line.startswith("ERROR"):
        print("Error Log:", line)